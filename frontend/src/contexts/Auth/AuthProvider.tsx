import { useState } from "react"
import { AuthContext } from "./AuthContext"
import { User } from "../../types/User";

export function AuthProvider({ children }: { children: JSX.Element}) {
    const [user, setUser] = useState<User | null>(null);

    function signin(email: String, password: String) {
        
    }

    function signout() {

    }


    return (
        <AuthContext.Provider value={{user, signin, signout}}>
            {children}
        </AuthContext.Provider>
    )
}