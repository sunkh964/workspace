// function ItemList(){

import Item from "./Item";

// }

const ItemList = ({item_list}) => {
  return(
    <div className='content'>
        {
          item_list.map((item, i) => {
            return(
              <Item key={i} item={item}/>
            );
          })
        }
      </div>
  );
}

export default ItemList;