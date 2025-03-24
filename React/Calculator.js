import React from 'react'

export default function Calculator({number1, number2}) {
    const num1 = parseFloat(number1);
    const num2 = parseFloat(number2);
  return (
    <div>
      <h2>Results:</h2>
      <p><strong>Sum:</strong> {num1 + num2}</p>
      <p><strong>Difference:</strong> {num1 - num2}</p>
      <p><strong>Product:</strong> {num1 * num2}</p>
    </div>
  )
}
