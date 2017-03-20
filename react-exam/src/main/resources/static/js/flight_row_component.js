var FlightRowComponent = React.createClass({

render: function() {
    return (
            <tr style={{backgroundColor: this.props.color}}>
              <td className='small'>
                <button onClick={this.handleSelectClick}>+</button>
                   {this.props.id}
              </td>
              <td className='small'>
              {this.props.flightNumber}
              </td>
              <td className='small'>
                {this.props.date}
              </td>
              <td className='small'>
                {this.props.time}
              </td>
              <td className='small'>
                {this.props.company}
              </td>
              <td className='small'>
                {this.props.status}
              </td>

            </tr>
    );
  }
});
window.FlightRowComponent = FlightRowComponent;
