import logo from './logo.svg';
import './App.css';
import { useState } from 'react';

// app() 함수의 리턴문 안에 작성하는 코드가 화면에 나타남.
// html 코드처럼 보이는 것은 실은 jsx 라는 문법이다.
// 그렇기 때문에 html과 조금 다른 부분이 있다.
function App() {
  console.log(1);
  //const titles = ['울산 맛집', 'React 공부', '집에가고싶다'];

  // 제목 정보를 저장하고 있는 변수
  const [titles, setTitles] = useState(['울산 맛집', 'React 공부', '집에가고싶다']);

  // 좋아요 갯수
  // 대괄호의 첫번째 : 변수
  // 두번째 : 변수의 값을 변경시켜주는 함수
  // ex) setLikeCnt(5) -> likeCnt 변수의 값을 5로 변경
  // useState로 만들어서 변수는 값을 변경하면 html화면을 재랜더링 한다

  let [likeCnt, setLikeCnt] = useState([0, 0, 0]);

  // detail 컴포넌트가 보일지 안보일지 결정하는 변수
  let [isShow, setIsShow] = useState(false);


  function test(){
    alert(1);
  }

  return (
    <div className="App">
      <div className="blog-nav">
        <h3>My Blog</h3>
      </div> 

      {/* {
        [1,2,3].map(() => {
          return (
            <div>1</div>
          );
        })
      } */}

      <button type='button' onClick={()=>{
        const copyTitles = [...titles];
        copyTitles[0] = '대구맛집';
        setTitles(copyTitles);
      }}>제목변경</button>

      {/* 블로그 글 목록 */}
      {
        titles.map((title,i) => {
          return (
            <Board title = {title} key = {i} />
          );
        })
      }

      {/* 상세보기 */}
      {
        isShow ? <Detail /> : null
      }
      
    </div>
  );
}

// 상세보기 컴포넌트
// 컴포넌트의 리턴문에 html 작성
// ahems html 태그는 하나의 최상위 태그에 포함되게 작성
function Detail(){
  return (
    <div className="detail">
        <h4>제목이 없습니다</h4>
        <p>날짜가 모랭</p>
        <p>상세내용이 없다고라고라</p>
      </div>
  );
};

// 블로그 글 하나에 대한 컴포넌트
// 전달되는 데이터는 매개변수에 props를 사용해서 전달 받음
function Board(props){
  return (
    <div className="list">
        <h4>
          {props.title}
          <span>👍</span>
          0
        </h4>
        <p>2024-07-04</p>
      </div>
  );
}

export default App;
