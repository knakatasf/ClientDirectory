import React, { useState } from 'react';
import axios from 'axios';

function ClientInteraction() {
  const [action, setAction] = useState('');
  const [chatInput, setChatInput] = useState('');

  const handleCheckboxChange = (event) => {
    setAction(event.target.value);
  };

  const handleChatInputChange = (event) => {
    setChatInput(event.target.value);
  };

  const handleSubmit = async (event) => {
    event.preventDefault();

    try {
      const response = await axios.post('/api/process', {
        action: action,
        input: chatInput
      });
      alert(response.data); // Handle success message
    } catch (error) {
      console.error('There was an error!', error);
    }
  };

  return (
      <div>
        <h2>Select an Action:</h2>
        <label>
          <input
              type="radio"
              name="action"
              value="insert"
              checked={action === 'insert'}
              onChange={handleCheckboxChange}
          />
          Insert
        </label>
        <label>
          <input
              type="radio"
              name="action"
              value="lookup"
              checked={action === 'lookup'}
              onChange={handleCheckboxChange}
          />
          LookUp
        </label>
        <label>
          <input
              type="radio"
              name="action"
              value="update"
              checked={action === 'update'}
              onChange={handleCheckboxChange}
          />
          Update
        </label>
        <br />
        <textarea
            rows="10"
            cols="50"
            value={chatInput}
            onChange={handleChatInputChange}
            placeholder="Paste client information here..."
        />
        <br />
        <button onClick={handleSubmit}>Submit</button>
      </div>
  );
}

export default ClientInteraction;




// import logo from './logo.svg';
// import './App.css';
//
// function App() {
//   return (
//     <div className="App">
//       <header className="App-header">
//         <img src={logo} className="App-logo" alt="logo" />
//         <p>
//           Edit <code>src/App.js</code> and save to reload.
//         </p>
//         <a
//           className="App-link"
//           href="https://reactjs.org"
//           target="_blank"
//           rel="noopener noreferrer"
//         >
//           Learn React
//         </a>
//       </header>
//     </div>
//   );
// }
//
// export default App;
