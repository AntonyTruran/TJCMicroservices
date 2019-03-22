import React, { Component } from 'react';
import { BrowserRouter as Router, Route, Link } from "react-router-dom";
import logo from './logo.svg';
import './App.css';
import axios from 'axios';
import * as Constants from './Constants';
import Login from './Login.js';
import PrizePage from './PrizePage.js';

class AccountCreated extends Component {
    constructor(props) {
        super(props);
        this.state = {
            Name: this.getName(),
            Number: this.getAccountNumber(),
        }
    }

    getName = () => {
        axios.get(Constants.FIRST_NAME)
            .then(r => this.setState({ Name: r.data }));

    }
    getAccountNumber = () => {
        axios.get(Constants.ACCOUNT_NUMBER)
            .then(r => this.setState({ Number: r.data }));
    }
  render() {
    return (
        <div wait={5000}>

            <div>
                <p>Hello   {this.state.Name}  </p>
            </div>
            <pre> Your Account Number Is: {this.state.Number}</pre>
            <pre>Click here to see if you have won<br/> a Prize!</pre>
            <form>
              <br></br>
              <Link to="/prizePage">
              <button type='submit' onClick={this.createAccount}>Claim Prize</button>
                </Link>
            </form>
      </div>
    );
  }
}

export default AccountCreated;
