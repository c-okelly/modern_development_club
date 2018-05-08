import React, { Component } from 'react';
import logo from '../images/logo.svg';
import '../styles/App.css';
import axios from 'axios';

class App extends Component {

  constructor(props) {
    super(props);
    this.defaultUrl = "http://localhost:9000/hello";
    this.state = {
      name: "",
      requestCount: 0
    }
  };

  render() {
    return (
      <div className="App">
        <div className="App-header">
          <h2>Modern development club chat app - landing page</h2>
        </div>

        <p className="App-intro">
          To get started, edit <code>src/App.js</code> and save to reload.
          <br/><br/>
          This current app makes a basic request against.
          <br/><br/>
          <b>Default url:</b> {this.state.defaultUrl}
          <br/><br/>
          <b>Fetched data:</b> {this.state.name}, there have been {this.state.requestCount} requests made against the server.

        </p>
      </div>

    );
  }

  fetchApiData() {
    axios.get(this.defaultUrl)
    .then(response => {
      console.log(response.data);
      let name = response.data.content;
      let id = response.data.id;
      this.setState({
        name: name,
        requestCount: id
      })
    })
    .catch(err => console.log(err));
  }

  componentDidMount() {
    this.fetchApiData();
    // this.interval = setInterval(() => this.fetchApiData(), 10 * 1000);
  }

}

export default App;