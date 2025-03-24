import React from 'react'

const names = ['java', 'python', 'spring', 'webservices', 'springboot'];
export default function ListOfNamesFunction(props) {
    const nlist = names.map((n) => <li> {n} </li>);
  return (
    <div>
      <ol>{nlist}</ol>
    </div>
  )
}
