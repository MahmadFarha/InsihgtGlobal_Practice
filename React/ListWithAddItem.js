import React from 'react'

export default function ListWithAddItem(props) {
    const initialListInChild = props.initialList;
    const [value, setValue] = React.useState('');
    const [list, setList] = React.useState(initialListInChild);
    const handleChange = event => {setValue(event.target.value);};
    const handleSubmit = event => {
        if(value){
            setList(list.concat(value));
            }
            event.preventDefault();
            setValue('');
        };
  return (
    <div>
      <ul>
        {list.map(item => (<li key = {item}> {item} </li>))}
      </ul>

      <form onSubmit = {handleSubmit}>
        <input type = "text" value = {value} onChange = {handleChange} />
        <button type = "submit">Add Item</button>
      </form>
    </div>
  )
}
