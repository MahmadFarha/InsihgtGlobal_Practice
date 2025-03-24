// import logo from './logo.svg';
import './App.css';
// import Child from './Child.js''
import Counter from './Counter.js';
import MobileDetails from './MobileDetails.js';
import Calculator from './Calculator.js';
import React, { useState } from "react";
import CounteraFunctionComp from "./CounteraFunctionComp.js";
import ListOfNamesFunction from "./ListOfNamesFunction";
import ListOfNums from "./ListOfNums";
import MapFunction from "./MapFunction";
import ListWithAddItem from "./ListWithAddItem";

function App() {

  const mobiles = [
    { id: 1, model: "iPhone 15", price: 79999 },
    { id: 2, model: "Samsung Galaxy S23", price: 74999 },
    { id: 3, model: "OnePlus 11", price: 59999 },
    { id: 4, model: "Google Pixel 7", price: 68999 }
  ];

  const [number1, setNumber1] = useState("");
  const [number2, setNumber2] = useState("");

  const numbers = [0,1,2,3,4,5,6,7,8,9];

  const listOfJSONData = [
    {
      "id": 1,
      "name": "Amit Kumar",
      "age": 25,
      "gender": "Male",
      "skills": ["Java", "Spring Boot", "MySQL"]
    },
    {
      "id": 2,
      "name": "Sara Ali",
      "age": 28,
      "gender": "Female",
      "skills": ["React", "Node.js", "MongoDB"]
    },
    {
      "id": 3,
      "name": "Rajesh Verma",
      "age": 22,
      "gender": "Male",
      "skills": ["Python", "Django", "PostgreSQL"]
    },
    {
      "id": 4,
      "name": "Neha Sharma",
      "age": 30,
      "gender": "Female",
      "skills": ["Angular", "TypeScript", "Firebase"]
    },
    {
      "id": 5,
      "name": "Vikram Patel",
      "age": 27,
      "gender": "Male",
      "skills": ["C#", ".NET Core", "Azure"]
    }
  ];

  const initialList = [
    'Hello World', 'Bots', 'KLU'
  ];

  return (
    <div className="App">
      {/* <h1>Hello World</h1> */}
      {/* <Child /> */}
      <Counter />

      <div>
        {mobiles.map((mobile) => (
          <MobileDetails key = {mobile.id} {...mobile} />
          // <MobileDetails key = {mobile.id} id = {mobile.id} model = {mobile.model} price = {mobile.price} />
        ))}
      </div>

      <div>
        <h1>Calculator App</h1>
        <form>
          <input type = "number" placeholder = "Enter number 1" value = {number1} onChange = { (e) => setNumber1(e.target.value) } />
          <input type = "number" placeholder = "Enter number 2" value = {number2} onChange = { (e) => setNumber2(e.target.value) } />
        </form>
        <Calculator number1 = {number1} number2 = {number2} />
      </div>

      <div>
        <CounteraFunctionComp />
      </div>

      <div>
        <ListOfNamesFunction />
      </div>

      <div>
        <ListOfNums numbers = {numbers} />
      </div>

      <div>
        <MapFunction listOfJSONData = {listOfJSONData} />
      </div>

      <div>
        <ListWithAddItem initialList = {initialList} />
      </div>
    </div>
  );
}

export default App;
