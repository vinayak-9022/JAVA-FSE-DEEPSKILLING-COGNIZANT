import logo from './logo.svg';
import './App.css';

import Home from "./components/Home";
import About from "./components/About";
import Contact from "./components/Contact";

function App() {
  return (
    <div>
      <Home />
      <hr />
      <About />
      <hr />
      <Contact />
    </div>
  );
}

export default App;
