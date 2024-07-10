import { type } from "@testing-library/user-event/dist/type";

function Controller(props){
  console.log(2);
  return(
    <div className='controller'>
        {/* 방법1 */}
        <button type='button' onClick={() => {
          props.setCount(props.count-10);
        }}>-10</button>
        <button type='button' onClick={() => {
          props.setCount(props.count-1);
        }}>-1</button>
        {/* 방법2 */}
        <button type='button' value="+1" onClick={(e) => {
          props.changeCount(e.target.value);
        }}>+1</button>
        <button type='button' value="+10" onClick={(e) => {
          props.changeCount(e.target.value);
        }} >+10</button>
      </div>
  );
}

export default Controller;