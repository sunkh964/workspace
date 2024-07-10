import logo from './logo.svg';
import './App.css';
import { useState } from 'react';
import List from './List';
import Add from './Add';

// 리스트의 1번째 요소부터 2개 삭제
// list.splice(1,2);

function App() {
  // 장보기 목록
  const [lists, setLists] = useState(['계란 한 판', '생수', '불고기용 돼지고기']);

  return (
    <div className="App">
      <h2>Shopping List</h2>
      <List lists = {lists} setLists={setLists}/>
      <Add lists={lists} setLists={setLists}/>
    </div>
  );
}

export default App;
