import React, { Component } from 'react'

export default class Counter extends Component {

    constructor(){
        super();
        this.state = {
            count : 0
        };
    }

    increment = () => {
        this.setState( (prevState) => ({ count: prevState.count + 1 }));
    };

    decrement = () => {
        this.setState( (prevState) => ({count: prevState.count - 1 }));
    };

  render() {
    return (
      <div>
        <h1>Counter: {this.state.count}</h1>
        <button onClick = {this.increment}> + + </button>
        <br/>
        <button onClick = {this.decrement}> - - </button>
      </div>
    );
  }
}
