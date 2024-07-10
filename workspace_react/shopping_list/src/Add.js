import { useState } from "react";

function Add(props){
  // input 태그의 데이터를 저장할 변수
  let [text, setText] = useState('');

  return(
    <div className='Add'>
        <input type='text' onChange={(e) => {
          setText(e.target.value);
        }}></input>
        <button type='button' onClick={(e) => {
          // input 태그에 입력한 내용에 가져온다.
          //text;

          // 가져온 내용을 lists에 추가한다
          props.lists.push(text);
          console.log(props.lists);

          // 변경된 lists의 내용으로 setLists 함수를 호출
          props.setLists([...props.lists]);
        }}>추가</button>
      </div>
  );
};

export default Add;