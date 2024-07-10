function List(props){
  <h4>장보기 목록</h4>
    return(
      props.lists.map((list,i) => {
        <div className="item-div" key = {i}>
            <span>{list}</span>
            <button type="button" onClick={(e)=> {
              // 방법 1
              // const copyList = [...props.lists];
              // copyList.splice(i,1);
              // props.setList(copyList);

              // 방법 2
              props.lists.splice(i,1);
              props.setLists([...props.lists]);

            }}>삭제</button>
        </div>
      })
    );
}

export default List;