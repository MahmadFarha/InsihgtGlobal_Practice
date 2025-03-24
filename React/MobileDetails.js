import React from 'react'

export default function MobileDetails({id, model, price}) {
  return (
    <div>
      <h2>Model: {model}</h2>
      <p>Id: {id}</p>
      <p>Price: {price}</p>
    </div>
  );
}
