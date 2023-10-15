function clearScreen() {
    document.getElementById("result").value = "";
  }
  // Displays entered value on screen.
  function liveScreen(value) {
    document.getElementById("result").value += value;
  }