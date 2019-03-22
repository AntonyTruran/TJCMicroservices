import React from 'react';
import { BrowserRouter as Router, Switch, Route } from 'react-router-dom';
import AccountCreated from './AccountCreated.js';
import Login from './Login.js';
const Main = () => (
    <main>
        <Router>
            <Switch>
                <Route exact path='/' component={Login} />
                <Route path='/accountCreated' component={AccountCreated} />
            </Switch>
        </Router>
    </main>
)
export default Main;