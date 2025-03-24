import React from 'react'

export default function ListOfNamesFunction(props) {
    const nums = props.numbers;
    const listItems = nums.map((x) => <li>{x}</li>);
  return (
    <div>
      <ul>{listItems}</ul>
      <ol>{listItems}</ol>
    </div>
  )
}
