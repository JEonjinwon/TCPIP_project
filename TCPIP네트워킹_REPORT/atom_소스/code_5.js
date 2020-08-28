const fs - require('fs');

fs.readFile('none.txt',(error,file)=> {
  if(error){
    console.log('파일을 읽어 들이는데 문제가 발생하셨습니다.');
    console.log(error);
  }else {
    console.log(file);
    console.log(file.toString());
  }
});
