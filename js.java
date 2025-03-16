document.getElementById('generateButton').addEventListener('click', async () => {
  const prompt = document.getElementById('prompt').value;

  const response = await fetch('/ai-music-generator/music', {
    method: 'POST',
    headers: { 'Content-Type': 'application/json' },
    body: JSON.stringify({ prompt })
  });

  const data = await response.json();
  const audioPlayer = document.getElementById('audioPlayer');
  audioPlayer.src = data.audioUrl;
  audioPlayer.play();
});