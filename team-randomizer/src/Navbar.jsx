import { Link } from "react-router-dom";
import './Navbar.css';

export default function Navbar() {
    return <nav className="nav">
        <Link to="/" className="site-title">
            site name
        </Link>
        <ul>
            <Link to="/switchOne">Switch</Link>
            <Link to="/draft">Draft</Link>
        </ul>
    </nav>
}