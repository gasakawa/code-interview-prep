const assert = require('assert');

// this is the main function
function containsDuplicate(nums) {
  const unique = Array.from(new Set(nums));

  return unique.length === nums.length ? false : true;
}

function test() {
  {
    const arr = [1, 1, 1, 3, 3, 4, 3, 2, 4, 2];
    const result = containsDuplicate(arr);
    assert(result === true);
  }

  {
    const arr = [1, 2, 3, 4, 5, 6];
    const result = containsDuplicate(arr);
    assert(result === false);
  }
}

test();
