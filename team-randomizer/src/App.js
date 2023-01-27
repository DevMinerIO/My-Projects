import './App.css';
import { Route, Routes } from "react-router-dom"
import Navbar from './Navbar';
import PlayerInput from './PlayerInput';

function App() {
  return (
    <>
      <Navbar />
      <div className="container">
        <PlayerInput />
        {/* TODO future routes */}
        {/* <Routes> */}
        {/* <Route path="/" element={<Home />} />
          <Route path="/switchOne" element={<Switch />} />
          <Route path="/draft" element={<Draft />} /> */}
        {/* </Routes> */}
      </div>
    </>
  );
}

export default App;
