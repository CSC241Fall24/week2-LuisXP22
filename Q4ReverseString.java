function reverse(s) {
    if (s === "") {
        return s;
    }

    return reverse(s.substring(1)) + s.charAt(0);
}

const input = "test string";
const reversed = reverse(input);
console.log(reversed);
