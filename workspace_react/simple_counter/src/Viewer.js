// Viewer 컴포넌트
function Viewer(props){
  return(
    <div className='viewer'>
        <h4>현재 카운터</h4>
        <p>{props.count}</p>
      </div>
  );
}

export default Viewer;