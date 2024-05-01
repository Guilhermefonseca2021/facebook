import { ChangeEvent, useContext, useState } from "react";
import "./App.css";
import { AuthContext } from "./contexts/Auth/AuthContext";

export default function App() {
  const [email, setEmail] = useState("");
  const [password, setPassword] = useState("");
  const auth = useContext(AuthContext);

  function handleEmail(e: ChangeEvent<HTMLInputElement>) {
    setEmail(e.target.value);
  }

  function handlePassword(e: ChangeEvent<HTMLInputElement>) {
    setPassword(e.target.value);
  }

  async function handleLogin() {
    if(email && password) {
      const isLogged = await auth.signin(email, password);
    }
  }

  return (
    <div className="container">
      <div className="content">
        <h1>facebook</h1>
        <h2>
          Facebook helps you connect and share with the people in your life.
        </h2>
      </div>
      <form action="">
        <input
          type="text"
          value={email}
          name="email"
          placeholder="email"
          onChange={handleEmail}
        />
        <input
          type="text"
          value={password}
          name="password"
          placeholder="password"
          onChange={handlePassword}
        />
        <button type="submit">
          <b>Log in</b>
        </button>
        <p>forgotten password?</p>
        <button onClick={handleLogin}>Create New Account</button>
      </form>
    </div>
  );
}
