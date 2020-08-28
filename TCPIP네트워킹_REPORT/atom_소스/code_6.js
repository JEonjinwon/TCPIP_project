var http = require(`http`);
var server = http.createServer();

var host = `127.0.0.1`
var port = 3000;

server.listen(port, host, 50000, function(){
  console.log(`웹 서버가 실행되었습니다: %d`,port);
});

server.on(`connection`,function(socket){
  console.log(`클라이언트가 접속했습니다.`);
});
server.on(`require`,function(req,res){
  console.log(`클라이언트 요청이 들어왔습니다.`);
  res.write("<head>");
  res.write("<title>응답페이지</title>");
  res.write("</head>");
  res.write("<body>");
  res.write("<h1> 웹 서버로부터 받은 응답</h1>");
  res.write("<body>");
  res.end();
});
server.on(`close`,function(){
  console.log(`서버가 종료됩니다`);
});
