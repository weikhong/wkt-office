angular.module('starter.services', [])

.service('Todo', function() {
 
    var todos = [
        {'title': 'Go poke a(n) house.', 'done': 'false'},
		{'title': 'Go fill a(n) Ferrero Rocher.', 'done': 'false'},
		{'title': 'Go read a(n) grocery bag.', 'done': 'false'},
		{'title': 'Go step on a(n) really bad singer.', 'done': 'false'},
		{'title': 'Go boil a(n) cloud.', 'done': 'false'},
		{'title': 'Go step on a(n) t-shirt.', 'done': 'true'},
		{'title': 'Go slap a(n) grocery bag.', 'done': 'false'},
		{'title': 'Go sit on a(n) Ferrero Rocher.', 'done': 'false'},
		{'title': 'Go bomb a(n) Ferrero Rocher.', 'done': 'false'},
		{'title': 'Go read a(n) grocery bag.', 'done': 'true'},
		{'title': 'Go fill a(n) cloud.', 'done': 'false'},
		{'title': 'Go step on a(n) cloud.', 'done': 'false'},
		{'title': 'Go squash a(n) Ferrero Rocher.', 'done': 'false'},
		{'title': 'Go fluff a(n) wire.', 'done': 'true'},
		{'title': 'Go fluff a(n) door.', 'done': 'false'}];
 
    this.list = function() {
        return todos;
    }
 
    this.add = function(todo) {
        todos.splice(0, 0, todo);
    }
 
});