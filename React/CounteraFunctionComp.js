import React, {useState} from 'react'
   
export default function CounteraFunctionComp() {
    const [count, setCount] = useState(0);
  return (
    <div>
    <Header />
      <p>Counter: {count}</p>
      <button onClick = {() => setCount(count - 1)}>decrement</button>
      <button onClick = {() => setCount(count + 1)}>increment</button>
    <Footer />
    </div>
  )
}

// arrow function
const Header = () => <h1> Header - React Hooks </h1>

// anonymous function
const Footer = function(){
    return(
        <div><h1>Footer</h1></div>
    );
}