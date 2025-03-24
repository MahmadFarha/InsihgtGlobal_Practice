import React from 'react'

export default function MapFunction(props) {
    const listItemsOfJOSN = props.listOfJSONData;
  return (
    <ul>
      {listItemsOfJOSN.map(x => (
        <li key = {x.id}>
            {x.id} -> {x.name} {x.age} {x.gender} {x.skills}
        </li>
      ))}
    </ul>
  )
}

