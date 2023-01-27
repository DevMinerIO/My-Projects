import './PlayerInput.css'
import { useState } from 'react'

export default function PlayerInput() {
    // keep on change values for the textbox
    const [val, setVal] = useState('');

    // function for updating players on change of text box
    const updatePlayers = event => {
        setVal(event.target.value);
    }
    // function for adding players to array on click
    const handleClick = () => {
        console.log("useState val is:" + val);
        let playerArray = val.split('\n');
        console.log('entire array');
        console.log(playerArray);
        console.log('Player array at index 0:');
        console.log(playerArray[0]);
        console.log('Player array at index 1:');
        console.log(playerArray[1]);

    }


    return <>
        {/* Todo: add player count */}
        <p>Player Count:</p>
        <p><label for="players">Players</label></p>
        <textarea onChange={updatePlayers} name="players" className="playerName" id='playersOne' value={val} cols="30" rows="30"></textarea>
        <br />
        <button type="submit" onClick={handleClick} value="roll" >Start Roll</button>
    </>

}