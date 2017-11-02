
requirejs.config({
    paths: {
        jquery : 'plugins/jQuery/jquery.min', // jQuery v2.2.3
        jqueryui : 'plugins/jQueryUI/juqery-ui-no-conflict', // jQuery UI - v1.11.4
        "jquery-ui-src" : 'plugins/jQueryUI/jquery-ui.min',
        backbone : 'plugins/backbone/backbone-min',
        underscore : "plugins/underscore/underscore-min", // Underscore.js 1.8.3
        text : "plugins/requirejs/text",
        datatables : 'plugins/datatables/datatables.min', // DataTables 1.10.12
        jqgrid : 'plugins/jqgrid/jquery.jqGrid.min', //
        jqgrid_locale : 'plugins/jqgrid/grid.locale-kr',
        bootstrap : 'plugins/bootstrap/js/bootstrap.min', // Bootstrap v3.3.6
        momentjs : 'plugins/moment/moment.min', // Moment js 2.14.1
        chartjs : 'plugins/chartjs/Chart.bundle.min', // ChartJS 2.1.6
        stomp : "plugins/stomp/stomp.min",
        sockjs : "plugins/sockjs/sockjs-1.1.1.min",
        JSXTransformer : "plugins/react/JSXTransformer",
        react : "plugins/react/react.min",
        'react-backbone' : "plugins/react/react.backbone",
        babylon : "plugins/babylon/babylon.2.4",
        cannon : "plugins/babylon/cannon",
        hand : "plugins/babylon/hand-1.3.7",
        oimo : "plugins/babylon/Oimo",
        "obj-loader" : "plugins/babylon/loaders/babylon.objFileLoader",
        "bjs" : "js/lib/babylon/bjs",
        w2ui : 'plugins/w2ui/w2ui-1.5.rc1.min',
        pixi : 'plugins/pixijs/pixi',
        views : "../views",
        cs : "css"
    },

    shim :{
        "jquery-ui-src" : {deps : ['jquery']},
        bootstrap : {deps : ['jquery',"jqueryui","css!plugins/bootstrap/css/bootstrap.min"]},
        adminLte : {deps : ['jquery',"jqueryui","bootstrap"]},
        backbone : {deps : ['underscore', 'jquery']},
        datatables : {deps : ['jquery']},
        jqgrid : {deps : ['jquery',"jqueryui"]},
        jqgrid_locale : {deps : ['jquery']},
        stomp : {exports : 'Stomp'},
        w2ui : {deps : ['css!plugins/w2ui/w2ui-1.5.rc1.min']},
        "obj-loader" : {deps : ['babylon','cannon','hand','oimo']},
        "bjs" : {deps : ['obj-loader']},
        react : {deps : ['JSXTransformer']},
    },
    map: {
        '*': {
            'css': 'plugins/requirejs/css.min' // or whatever the path to require-css is
        }
    }
});
