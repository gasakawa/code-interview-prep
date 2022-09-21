const assert = require("assert");

// this is the main function
function licenseKeyFormatting(s, k) {
  const letters = s.split("-");
  const newWord = letters.join("");

  let availableLetters = newWord.length;

  const groups = Math.ceil(availableLetters / k);
  let start = 0;
  let end = 0;

  const words = [];

  for (let i = groups - 1; i >= 0; i--) {
    if (availableLetters < k) {
      start = 0;
    } else {
      start = availableLetters - k;
    }

    end = availableLetters;

    const temp = newWord.substr(start, end);

    availableLetters = availableLetters - k;
    words[i] = temp.toUpperCase();
  }

  return words.join("-");
}

function test() {
  {
    const result = licenseKeyFormatting("5F3Z-2e-9-w", 4);
    assert(result === "5F3Z-2E9W");
  }

  {
    const result = licenseKeyFormatting("2-5g-3-J", 2);
    assert(result === "2-5G-3J");
  }
}

test();
