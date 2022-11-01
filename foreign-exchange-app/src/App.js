import { useState } from "react";
import { Button, Form } from "react-bootstrap";
import axios from "axios";
//import './App.css'

function App() {

  const [data, setData] = useState({});
  const [currRes, setCurrRes] = useState(0);

  const inputHandler = (event) => {
    setData(() => ({
      ...data, [event.target.name]: event.target.value
    }))
  }

  const submitHandler = (event) => {
    event.preventDefault();
    axios.get('http://localhost:9001/currencyconverter/', {
      params: data
    })
      .then(response => {

        setCurrRes(Number(response.data).toFixed(2));
      })
      .catch(error => {
        console.log(error.message);
      });
   
  }

  return (
    <div className="app ">
      <div className="d-flex justify-content-around"> <h1>Currency Converter App</h1></div>
      <div className=" ">
        <Form onSubmit={submitHandler}>
          <div className="d-flex justify-content-around">
            <div className="m-3">
              <Form.Label htmlFor="amount" >
                Enter The Amount to be Converted
              </Form.Label>
              <Form.Control
                className="mb-2"
                id="amount"
                placeholder="0.0"
                name="amount"
                type="number"
                step="0.01"
                onChange={inputHandler}
                required
              />
            </div>

            <div className="m-3">
              <Form.Label htmlFor="from" >
                CONVERT FROM
              </Form.Label>
              <Form.Control
                className="mb-2"
                id="from"
                placeholder="USD"
                name="from"
                onChange={inputHandler}
                required
              />
            </div>

            <div className="m-3">
              <Form.Label htmlFor="to" >
                CONVERT TO
              </Form.Label>
              <Form.Control
                className="mb-2"
                id="to"
                placeholder="INR"
                name="to"
                onChange={inputHandler}
                required
              />
            </div>
          </div>
          <div className="d-flex justify-content-center mt-4">
            <div style={{ display: currRes ? 'inline-block' : 'none' }} className="fs-1">
              {currRes}
            </div>
          </div>
          <div className="d-flex justify-content-center mt-4">
            <Button type="submit" className="">
              GET CONVERSION
            </Button>
          </div>
        </Form>
      </div>
    </div>
  );
}

export default App;
