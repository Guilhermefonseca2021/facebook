import { createContext } from "react";
import { User } from "../../types/User";

export type AuthContextType = {
    user: User | null;
    signin: ({email, password}: User) => Promise<boolean>;
    signout: () => void;
}

// no typecripst precisa criar tipo para cada contexto. a gente so preenche o contexto com informações- no provider.
export const AuthContext = createContext<AuthContextType>(null!);