
import React, { useEffect, useState } from 'react';

const WebSocketComponent = () => {
  const [message, setMessage] = useState('');

  useEffect(() => {
    
    const socket = new WebSocket('ws://localhost:9998/websocket');

    
    socket.addEventListener('message', (event) => {
      const newMessage = event.data;
      
      setMessage(newMessage);
    });

    return () => {
      
      socket.close();
    };
  }, []); 

  return (
    <div>
      <h1>Real-Time Data:</h1>
      <p>{message}</p>
    </div>
  );
};

export default WebSocketComponent;
