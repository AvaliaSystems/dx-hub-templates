<template>
  <div class="app">
    <Greeting />
  </div>
</template>

<script>
import Greeting from './components/Greeting.vue'

export default {
  components: {
    Greeting
  }
}
</script>

<style lang="scss" scoped>
.app {
  font-family: 'Open Sans', 'Helvetica Neue', sans-serif;
  font-size: 3rem;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  background-color: purple;
  color: #ffffff;
  display: flex;
  height: 100vh;
  width: 100vw;
  align-items: center;
  justify-content: center;
  margin: 0;
}
</style>>

<style lang="scss">
  body {
    margin: 0;
  }
</style>