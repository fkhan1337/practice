/* Import the http module */
var http = require('http');

/* Create http server, which prints "Hello, World!" and listen on port 8080 */
http.createServer(function(request, response) {
    response.writeHead(200);
    response.write("Hello, World!");
    response.end();
}).listen(8080);

/* Print message to console to indicate a running server */
console.log("Listening on port 8080...");
