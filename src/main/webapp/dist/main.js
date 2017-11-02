requirejs([
	"config"
], function(config) {
	requirejs([
		"jquery",
		//"obj-loader"
	], function($) {
		$(document).ready(function() {
			requirejs([
				"js/main"
			], function(
				Main
			){
				main = new Main();
				main.start();
			});
		});
	});
});
