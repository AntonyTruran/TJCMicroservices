import React, { Component } from 'react';
import { BrowserRouter as Router, Route, NavLink } from "react-router-dom";
import logo from './logo.svg';
import './App.css';
import axios from 'axios';
import AccountCreated from './AccountCreated';

class Login extends Component {
  constructor(props) {
    super(props);
    this.state = {
      firstName: '',
      lastName: '',
    }
    this.setFName = this.setFName.bind(this);
    this.setLName = this.setLName.bind(this);
  }

  createAccount = (e) => {
    axios.post('http://localhost:8080/createAccount', {
      "firstName": this.state.firstName,
      "lastName": this.state.lastName
    })
      .then(response => {
        console.log(response.data);
        this.setState({
          result: response.data
        });
        console.log("Done");
      });

  }

  setFName(event) {
    this.setState({ firstName: event.target.value });
    event.preventDefault();
  }

  setLName(event) {
    this.setState({ lastName: event.target.value });
    event.preventDefault();
  }

  render() {
    return (

      <div className="App">
        <Router>

          <form action="/AccountCreated.js">
            <h4>
              First Name:
              </h4>
            <input id="firstName" type="text" onChange={this.setFName} name="First Name"></input>

            <h4>
              Last Name:
              </h4>
            <input id="lastName" type="text" onChange={this.setLName} name="Last Name"></input>
            <br></br>
            <input type='submit' onClick={this.createAccount} value="Create Account"></input>
          </form>

          <Route path="/AccountedCreated.js" component={AccountCreated} />
        </Router>

      </div>
    );
  }
}

export default Login;
