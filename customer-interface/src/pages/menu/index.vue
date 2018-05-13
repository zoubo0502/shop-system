<template>
  <div>
    <div class="ad-swiper">
      <ad-swiper></ad-swiper>
    </div>
    <div class="search">
      <search></search>
    </div>
    <div class="menus">
      <div class="menu-type  weui-tab__panel">
        <li v-for="menu in menus" :key="menu.id">
          <span class="menu-name">{{menu.name}}</span>
        </li>
      </div>
      <div class="menu-detail weui-tab__panel">
        <li v-for="food in menu.foods" :key="food.id">
          <div class="menu-type-name">{{menu.name}}</div>
          <div class="food-name">{{food.name}}</div>
          <div class="food-description">{{food.description}}</div>
          <div class="food-price">{{food.price}}</div>
        </li>
      </div>
    </div>
    <div order-container>
      <div class="order-total"></div>
      <div class="order-place"></div>
    </div>
  </div>
</template>

<script>
import search from '@/components/searchbar/search'
import adSwiper from '@/components/swiper/swiper'
export default {
  data() {
    return {
      msg: 'hello shop',
      menu: {
        name: '特价',
        foods: [
          {
            name: '脆皮鸡',
            description: '很好吃的脆皮鸡哦',
            price: 28
          },
          {
            name: '脆皮鸡',
            description: '很好吃的脆皮鸡哦',
            price: 28
          },
          {
            name: '脆皮鸡',
            description: '很好吃的脆皮鸡哦',
            price: 28
          },
          {
            name: '脆皮鸡',
            description: '很好吃的脆皮鸡哦',
            price: 28
          },
          {
            name: '脆皮鸡',
            description: '很好吃的脆皮鸡哦',
            price: 28
          },
          {
            name: '脆皮鸡',
            description: '很好吃的脆皮鸡哦',
            price: 28
          }
        ]
      },
      menus: [
        { id: 1, name: '热销' },
        { id: 2, name: '特价' },
        { id: 3, name: '特价' },
        { id: 4, name: '特价' },
        { id: 5, name: '特价' }
      ]
    }
  },

  components: {
    search,
    adSwiper
  },

  methods: {},

  created() {}
}
</script>

<style scoped>
.menus {
  display: flex;
  height: 400px;
}
.menu-type {
  flex: 0 1 80px;
  padding-top: 0;
  background-color:rgb(245, 244, 244);
}
.menu-name {
  display: block;
  padding-top: 20px;
  height: 30px;
  text-align: center;
}
.menu-detail {
  flex: auto;
  padding-top: 0;
}
</style>
