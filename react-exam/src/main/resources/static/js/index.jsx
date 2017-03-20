var App = React.createClass({
  render: function() {
    return (
      <FlightContainer />
    );
  }
});

window.App = App;

var Router = ReactRouter.Router;
var Route = ReactRouter.Route;
var IndexRoute = ReactRouter.IndexRoute;
var hashHistory = ReactRouter.hashHistory;

ReactDOM.render((<App />
), document.getElementById('root'));
