var FlightContainer = React.createClass({
  getInitialState: function() {
    return {
      flights: [],
      color: ''
    };
  },
  componentWillMount: function() {
    var self = this;
    axios.get('/api/flights')
      .then(function (response) {
        self.setState({ flights: response.data });
      })
  },
  onSelectClick: function(){
    if(this.state.color === ''){
      this.setState({
        color: 'red'
      })
    } else {
      this.setState({
        color: ''
      })
    }
},
  onDeleteClick: function(){
    if(checked==='true'){
      axios.delete('/api/flights/{id}')
    }

  },
  render: function() {
    console.log("flightCOntainer",this);
    return (
      <Flight
        flights={this.state.flights}
        color={this.state.color}
        handleSelectClick={this.onSelectClick}
         />
    );
  }

});

window.FlightContainer = FlightContainer;
