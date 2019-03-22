import React, { Component } from 'react';
import { BrowserRouter as Router, Route, Link } from "react-router-dom";
import * as Constants from './Constants';
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
        axios.post(Constants.CREATE_ACCOUNT, {
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
          <form>
            <h4>
              First Name:
              </h4>
            <input id="firstName" type="text" onChange={this.setFName} name="First Name"></input>

            <h4>
              Last Name:
              </h4>
            <input id="lastName" type="text" onChange={this.setLName} name="Last Name"></input>
                    <br></br>
                    <Link to="/AccountCreated">
                    <button type='submit' onClick={this.createAccount}>Create Account</button></Link>

          </form>
      </div>
    );
  }
}

export default Login;
