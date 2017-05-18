exports.checkValue = function (body) {
  if (body && body.hasOwnProperty('value')) {
    if (body.value < 100) {
      return { 'value': 'value is less than 100'}
    } else {
      return { 'value': 'value is 100 or greater' }
    }
  } else {
    return null
  }
}