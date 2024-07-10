const Item = ({item}) => {
  return(
    <div className='c1'>
      <img src={process.env.PUBLIC_URL + '/' + item.imgName}/>
      <h4>{item.itemName}</h4>
      <p>{item.price}</p>
    </div>
  );
}

export default Item;