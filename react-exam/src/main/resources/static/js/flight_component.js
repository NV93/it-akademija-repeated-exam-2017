var Flight = React.createClass({
  render: function() {
    var array = [];
    this.props.flights.map(function(flights,index) {
      array.push(
        <FlightRowComponent
          id={flights.id}
          key={index}
          flightNumber={flights.flightNumber}
          date={flights.date}
          time={flights.time}
          company={flights.company}
          status={flights.status}
      />
      );
    });
    console.log("flight component",this);
      return (
        <div className="panel panel-default">
            <table width="100%" className="table table-striped table-hover">
              <thead>
                <tr>
                  <th className='col-xs-1'> Flight ID </th>
                  <th className='col-xs-1'> Flight Number</th>
                  <th className='col-xs-2'> Date </th>
                  <th className='col-xs-2'> Time </th>
                  <th className='col-xs-3'> Company </th>
                  <th className='col-xs-3'> Status </th>                
                </tr>
              </thead>
              <tbody>
               {array}
              </tbody>
            </table>

              </div>
    );
  }
});

window.Flight = Flight;
