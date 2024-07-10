import logo from './logo.svg';
import './App.css';
import Viewer from './Viewer';
import Controller from './Controller';
import { useState } from 'react';

function App() {
  console.log(1);
  // index.js 에 들어가서 <react> 주석처리하면 console에 1이 하나만 나옴
  let [count, setCount] = useState(0);

  function changeCount(num){
    // console.log(num);
    const result = count + Number(num);
    console.log(result);

    setCount(result);
  }

  return (
  <div className="App">
      <h2>Simple Counter</h2>
      <Viewer  count={count}/>
      <Controller setCount={setCount} count={count} changeCount={changeCount}/>
      {/* <Controller/>에 changeCount만 사용하면 앞에 setCount, count 삭제 가능 */}
    </div>
  );
}




export default App;
