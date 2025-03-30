import React, { useState, useEffect } from "react";
import axios from "axios";
import FlightDetails from "./FlightDetails";
import "bootstrap/dist/css/bootstrap.min.css";

const FlightPlanner = () => {
  const [flights, setFlights] = useState([]);
  const [search, setSearch] = useState({ from: "", to: "" });
  const [showResults, setShowResults] = useState(false); // Controls visibility

  const handleSearch = () => {
    axios.get("http://localhost:4600/flights").then((response) => {
      const filteredFlights = response.data.filter(
        (flight) =>
          flight.from.toLowerCase().includes(search.from.toLowerCase()) &&
          flight.to.toLowerCase().includes(search.to.toLowerCase())
      );
      setFlights(filteredFlights);
      setShowResults(true); // Show results only after searching
    });
  };

  return (
    <div className="container mt-5">
      <h2 className="text-center mb-4">Flight Search</h2>
      <div className="d-flex justify-content-center">
        <div className="card p-4 shadow-lg" style={{ width: "32rem" }}>
          <div className="mb-3">
            <label className="form-label">From</label>
            <input
              type="text"
              className="form-control"
              placeholder="Enter departure city"
              value={search.from}
              onChange={(e) => setSearch({ ...search, from: e.target.value })}
            />
          </div>
          <div className="mb-3">
            <label className="form-label">To</label>
            <input
              type="text"
              className="form-control"
              placeholder="Enter destination city"
              value={search.to}
              onChange={(e) => setSearch({ ...search, to: e.target.value })}
            />
          </div>
          <button className="btn btn-primary w-100" onClick={handleSearch}>
            🔍 Search Flights
          </button>
        </div>
      </div>
      {showResults && <FlightDetails flights={flights} />}{" "}
      {/* Show results only after searching */}
    </div>
  );
};

export default FlightPlanner;
