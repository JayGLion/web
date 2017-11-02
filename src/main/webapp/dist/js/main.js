define([
    "jquery",
    "underscore",
    "backbone",
    "w2ui"
],function(
    $,
    _,
    Backbone,
    W2ui
){
	
    var Main = Backbone.View.extend({
        el: 'body',
    	initialize : function() {
    		var _this = this;
    		this.elements = {
    				
    		};
        },
        start: function() {
        	window.w2utils.settings.dataType = "RESTFULL"
        	$('#grid').w2grid({ 
        	    name   : 'myGrid', 
        	    url    : 'board',
        	    columns: [                
        	        { field: 'seq', caption: 'seq', size: '30%' },
        	        { field: 'title', caption: 'title', size: '30%' },
        	        { field: 'author', caption: 'author', size: '120px' },
        	        { field: 'content', caption: 'content', size: '120px' },
        	    ],
        	    onSave : function(evt) {
        	    	console.log(evt);
        	    }
        	});
        	$('#form').w2form({ 
                name   : 'myForm',
                url    : 'board',
                fields : [
                    { name: 'title', type: 'text', required: true },
                    { name: 'author', type: 'text', required: true },
                    { name: 'content',  type: 'text', required: true },
                ],
                actions: {
                    reset: function () {
                        this.clear();
                    },
                    save: function () {
                    	this.postData = this.record;
                    	this.save();
                    }
                }
            });
        	$('#form-put').w2form({ 
                name   : 'putForm',
                url    : 'board/',
                fields : [
                    { name: 'title', type: 'text', required: true },
                    { name: 'author', type: 'text', required: true },
                    { name: 'content',  type: 'text', required: true },
                ],
                actions: {
                    reset: function () {
                        this.clear();
                    },
                    save: function () {
                    	this.postData = this.record;
                    	this.recid = 123;
                    	this.save();
                    }
                }
            });
        },
        del : function(id) {
        	$.ajax({
                url: 'board/'+id,
                type: 'DELETE'
            });
        }
    })

    return Main;
});