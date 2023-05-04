<template>
  <div class="panel">
    <div class="title">
      {{ systemName }}, by Avalia Systems
    </div>
    <div class="message" :style="{ color: greeting.color}">
      {{ greeting?.message }}
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      systemName: '${{ values.name }}',
      greeting: {
        message: '',
        color: '',
        timesamp: '',
      },
      polling: null,
    };
  },
  methods: {
    async fetchGreeting() {
      try {
        const response = await fetch("http://localhost:8080/greeting");
        const greeting = await response.json();
        this.greeting = greeting;
        return greeting;
      } catch (e) {
        this.greeting = {
          message: 'Cannot reach ${{ values.name }}-backend...',
          color: 'red',
          timesamp: new Date(),
        };
        return this.greeting;
      }
    },
  },
  async mounted() {
    this.fetchGreeting();
    this.polling = setInterval(() => {
      this.fetchGreeting();
    }, 1000);
  },
  unmounted() {
    clearInterval(this.polling);
  }
}
</script>

<style lang="scss" scoped>

.panel {
  display: flex;
  flex-direction: column;
}
.title {
  font-size: 1.4rem;
  color: "magenta";
}
.message {
  font-size: 1.8rem;
  color: "magenta";
}

</style>