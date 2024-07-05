import logo from './logo.svg';
import './App.css';
import { useState } from 'react';

function App() {
  const board_list = [
    {
      boardNum : 1,
      title : '첫번째 게시글',
      content : '첫번째 내용',
      writer : '김자바'
    }, 
    {
      boardNum : 2,
      title : '두번째 게시글',
      content : '두번째 내용',
      writer : '박자바'
    }, 
    {
      boardNum : 3,
      title : '세번째 게시글',
      content : '세번째 내용',
      writer : '이자바'
    }];

    // detail 컴포넌트가 보일지 안보일지 결정하는 변수
    const [isShow, setIsShow] = useState(false);
    const [index, setIndex] = useState(0);

  return (
    <div className="App">
      <div className='container'>
        <table>
          <thead>
            <tr>
              <td>글번호</td>
              <td>제목</td>
              <td>작성자</td>
            </tr>
          </thead>
          <tbody>
            {
              board_list.map((list, i) => {
                return(
                  <tr key={i}>
                    <td>{list.boardNum}</td>
                    <td>
                      <span className='title-span' onClick={() => {
                      setIsShow(true);
                      setIndex(i);
                    }}>{list.title}</span>
                    </td>
                    <td>{list.writer}</td>
                  </tr>
                );
              })
            }
          </tbody>
        </table>
        
        {
          isShow ? <Detail board = {board_list[index]}/> : null
        }

      </div>
    </div>
  );
}

function Detail(props){
  return(
    <div className="detail"> 
      글 번호 : {props.board.boardNum}<br />
      글 제목 : {props.board.title}<br />
      내용 : {props.board.content}<br />
      작성자 : {props.board.writer}<br />
    </div>
  );
}

export default App;
