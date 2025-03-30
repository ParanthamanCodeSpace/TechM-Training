import React from "react";

const FlightDetails = ({ flights }) => {
  // Function to handle flight booking
  const handleBooking = (flight) => {
    alert("Flight booked successfully! ✈️");
    console.log("Booked Flight Details:", flight);
  };

  return (
    <div className="container mt-4">
      <h3 className="text-center">Available Flights</h3>
      <div className="row justify-content-center">
        {flights.length > 0 ? (
          flights.map((flight) => (
            <div
              key={flight.id}
              className="col-md-4 d-flex justify-content-center"
            >
              <div
                className="card mb-4 shadow-lg border-0"
                style={{
                  width: "28rem", // ⬅️ Adjusted width for better appearance
                  borderRadius: "10px",
                  padding: "15px",
                  backgroundColor: "#f8f9fa",
                }}
              >
                <div className="card-body text-center">
                  <h5 className="card-title text-primary">
                    ✈️ {flight.airline}
                  </h5>
                  <p className="card-text">
                    <strong>From: </strong> {flight.from} <br />
                    <strong>To: </strong> {flight.to} <br />
                    <strong>Departure:</strong> {flight.departure} <br />
                    <strong>Arrival: </strong> {flight.arrival} <br />
                    <strong>Price: </strong> ₹{flight.price}
                  </p>
                  {/* Book Now Button */}
                  <button
                    className="btn btn-success mt-2"
                    onClick={() => handleBooking(flight)}
                  >
                    Book Now
                  </button>
                </div>
              </div>
            </div>
          ))
        ) : (
          <p className="text-center mt-3 text-danger">No flights found.</p>
        )}
      </div>
    </div>
  );
};

export default FlightDetails;
